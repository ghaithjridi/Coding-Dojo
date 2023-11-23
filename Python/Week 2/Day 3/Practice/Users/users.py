from mysqlconnection import connectToMySQL
DATABASE="user_schema"



class User:
    def __init__(self,data):
        self.id=data["id"]
        self.first_name=data["first_name"]
        self.last_name=data["last_name"]
        self.email=data["email"]
        self.created_at=data["created_at"]
        self.updated_at=data["updated_at"]
    
    @classmethod
    def get_all(cls):
            query= "SELECT * FROM users;"
            results=connectToMySQL(DATABASE).query_db(query)
            print(results)
            users=[]
            for row in results:
                one_user=cls(row)
                users.append(one_user)
            
            return users
    @classmethod
    def edit(cls,data):
        query= """
                INSERT INTO users (first_name,last_name,email)
    	        VALUES (%(first_name)s,%(last_name)s,%(email)s);
                """
        
        results=connectToMySQL(DATABASE).query_db(query,data)
        print(results)
        return results    