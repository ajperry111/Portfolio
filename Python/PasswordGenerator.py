import random
import string
symbols=((chr(33)),(chr(64)),(chr(35)),(chr(36)),(chr(37)),(chr(94)),(chr(38)),(chr(42)),(chr(40)),(chr(41)))
lowernum,uppernum,numnum,symnum= int(input("How many lowercase letters: ")), int(input("Uppercase: ")), int(input("Numbers: ")), int(input("Symbols: "))
lowercase=''.join(random.choice(string.ascii_lowercase) for i in range(lowernum))
uppercase=''.join(random.choice(string.ascii_uppercase) for i in range(uppernum))
numbers=''.join(random.choice(string.digits) for i in range(numnum))
symbols=''.join(random.choice(symbols) for i in range(symnum))
password=((lowercase) + (uppercase) + (numbers) + (symbols))
print(password)

