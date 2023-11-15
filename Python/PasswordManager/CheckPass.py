class CheckPass:

    @staticmethod
    def checkPassword(password):
        import re as re
        capital=re.findall(r'[ABCDEFGHIJKLMNOPQRSTUVWXYZ]',password)
        number=re.findall(r'[1234567890]', password)
        symbol=re.findall(r'[!@#$%^&*()]',password)
        if symbol!=[] and number!=[] and capital!=[]:
            if len(password)>=8:
                print("This password is safe.")
                return 1
        else:
            print("New Password must have 1 capital letter,number,symbol and 8 or more digits")
            return 0
    
