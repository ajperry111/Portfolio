import random
import re as re
class PasswordGenerator: 

    def newPassword():
        special=(33,35,36,37,38,40,41,42,64,94)
        password=""
        correctPassword=0
        #inputs of character amounts
        while correctPassword!=1:
          length=int(input("Lenth of password (Must be 8 or greater): "))
          #random character generation
          if length>=8:
            while correctPassword!=1:
                for x in range(length):
                    rand=random.randint(1,4)
                    if rand==1:
                        btwn=random.randint(65,90)
                        btwn=chr(btwn)
                        password+=btwn
                    if rand==2:
                        btwn=random.randint(97,122)
                        btwn=chr(btwn)
                        password+=btwn
                    if rand==3:
                        btwn=random.randint(48,57)
                        btwn=chr(btwn)
                        password+=btwn
                    if rand==4:
                        btwn=random.choice(special)
                        btwn=chr(btwn)
                        password+=btwn
                capital=re.findall(r'[ABCDEFGHIJKLMNOPQRSTUVWXYZ]',password)
                number=re.findall(r'[1234567890]', password)
                symbol=re.findall(r'[!@#$%^&*()]',password)
                if symbol!=[] and number!=[] and capital!=[]:
                    correctPassword=1
                    return password
                else:
                  password=""
              
