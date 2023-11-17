from flask import Flask,render_template  

app = Flask(__name__)    

@app.route('/play')          
def hello_world():
    return render_template("index.html")

@app.route('/play/<colorchange>')          
def hello_world1(colorchange):
    return render_template("index2.html",colorchange=colorchange ,num=3)

@app.route('/play/<colorchange>/<int:num>')          
def hello_world2(colorchange,num):
    return render_template("index2.html",colorchange=colorchange ,num=num)





if __name__=="__main__":   
    app.run(debug=True)    



