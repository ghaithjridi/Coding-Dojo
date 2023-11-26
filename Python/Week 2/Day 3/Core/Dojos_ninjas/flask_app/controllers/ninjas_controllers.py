from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.ninjas_models import Ninja
from flask_app.models.dojos_models import Dojo

@app.route('/ninjas')
def movies():
    all_dojos=Dojo.get_all()
    all_ninjas=Ninja.get_all()
    return render_template('ninjas.html',all_dojos=all_dojos,all_ninjas=all_ninjas)

@app.route('/create/ninja',methods=['POST'])
def create_movie():
    data={
        "first_name":request.form['first_name'],
        "last_name" :request.form['last_name'],
        "dojo_id":request.form['filmmaker_id']
    }
    Ninja.save(data)
    return redirect('/ninjas')


