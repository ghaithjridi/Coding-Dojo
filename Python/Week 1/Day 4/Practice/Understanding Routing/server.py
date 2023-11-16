from flask import Flask  
app = Flask(__name__)    
@app.route('/')          
def hello_world():
    return 'Hello ghaith!'
@app.route('/Dojo')
def success():
    return "dojo!"
@app.route('/Say/<Flask>')
def say1(Flask):
    return  f"Hi {Flask}!"
@app.route('/repeat/<string:hello>/<int:num>/')
def hello2(hello,num):
    return f"{hello} {num} times"


if __name__=="__main__":      
    app.run(debug=True)    

