from flask import Flask

app = Flask(__name__)
app.secret_key = "shhh no secrets on github!"

DATABASE = "log_reg.schema"