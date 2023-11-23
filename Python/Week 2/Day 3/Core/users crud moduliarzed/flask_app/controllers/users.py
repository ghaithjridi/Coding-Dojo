# users.py
from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.users import User
@app.route("/")     
# The "@" decorator associates this route with the function immediately following
def index():
    
    return redirect('/form')    

@app.route("/form")     
# The "@" decorator associates this route with the function immediately following
def display_form():
    all_user=User.get_all()
    print(all_user)
    return render_template("form.html", users=all_user)

@app.route("/form/add")     
# The "@" decorator associates this route with the function immediately following
def display_add():
    
    return render_template("index.html", )



@app.route ("/create", methods=["POST"])     
# The "@" decorator associates this route with the function immediately following
def create():
    print(request.form)
    user_dict={
        "first_name":request.form["first_name"],
        "last_name":request.form["last_name"],
        "email":request.form["email"],
        
    }
    User.edit(user_dict)
    
    return redirect("/form")

@app.route ("/show/<int:id>")    
# The "@" decorator associates this route with the function immediately following
def show(id):

    data={
        "id":id
    }
    user=User.hey(data)
    return render_template("show.html", user=user)

@app.route ("/transform/<int:id>")    
# The "@" decorator associates this route with the function immediately following
def goto(id):
    data={
        "id":id
    }
    user=User.hey(data)
    return render_template("update.html",user=user)

@app.route ("/update",methods=["POST"])    
# The "@" decorator associates this route with the function immediately following
def update_user():
    
    User.update(request.form)
    return redirect("/")