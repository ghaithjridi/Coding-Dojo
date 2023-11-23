from flask import Flask,render_template,request,redirect
from users import User 
# Import Flask to allow us to create our app
app = Flask(__name__)
# Create a new instance of the Flask class called "app"
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
        "first name":request.form["first_name"],
        "last name":request.form["last_name"],
        "email":request.form["email"],
        
    }
    User.edit(user_dict)
    
    return redirect("/form")
    
    
    





# Return the string 'Hello World!' as a response
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

