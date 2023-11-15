import turtle as trtl
import random

painter = trtl.Turtle()
painter.speed(0)
colors=["black","orange","darkorchid","blue","yellow","red","green","pink","cyan"]

def flowerRing(x,y,numberOfFlowers,dis):
     #inner yellow ring of 9 petals
     painter.goto(x,y)
     for petal in range(numberOfFlowers):
          painter.right(360/numberOfFlowers)
          painter.forward(dis)
          painter.stamp()   
          
def alternatingFlowerRing(x,y,numberOfFlowers,dis):
    painter.goto(x,y)
    for petal in range(numberOfFlowers):
        if petal%3==0:
            painter.color("yellow")
        elif petal%3==1:
            painter.color("orange")
        else:
            painter.color("red")
        painter.right(360/numberOfFlowers)
        painter.forward(dis)
        painter.stamp()

def twoLayer():
     # stem
     painter.color("green")
     painter.pensize(15)
     painter.goto(0, -150)
     painter.setheading(90)
     painter.forward(100)
     #  leaf
     painter.setheading(270)
     painter.circle(20, 120, 20)
     painter.setheading(90)
     painter.goto(0, -60)
     # rest of stem
     painter.forward(60)
     painter.setheading(0)

     # change pen
     painter.penup()
     painter.shape("circle")
     painter.turtlesize(3)

     # draw flower
     painter.color("darkorchid")
     painter.goto(20,180)
     painter.pendown()

     #outer purple ring
     for petal in range(18):
          painter.right(20)
          painter.forward(30)
          painter.stamp()

     #inner yellow ring of 9 petals
     painter.penup()
     painter.goto(15,120)
     painter.pendown()
     painter.color("yellow")
     for petal in range(9):
          painter.right(40)
          painter.forward(20)
          painter.stamp()
     painter.hideturtle()

def threeLayer():
     # stem
     painter.color("green")
     painter.pensize(15)
     painter.goto(0, -150)
     painter.setheading(90)
     painter.forward(100)
     #  leaf
     painter.setheading(270)
     painter.circle(20, 120, 20)
     painter.setheading(90)
     painter.goto(0, -60)
     # rest of stem
     painter.forward(60)
     painter.setheading(0)

     # change pen
     painter.penup()
     painter.shape("circle")
     painter.turtlesize(3)


     # draw flower
     
     
     painter.pendown()
     
     
     x,y,numberOfFlowers,dis = 20,120,10,20
     for i in range(17):
          alternatingFlowerRing(x, y, numberOfFlowers, dis)
          y+=30
          numberOfFlowers+=10

     painter.hideturtle()
   
#make a field of flowers
#need to draw about 52 flowers

#################
# if I need to generate a bunch of items on the screen...
### put the item in a function then loop... like below
## like if I need to make a bunch of snow or something
## and if the snow was in a list... you could.......
#### loop through the list and change each x and y and make your snow move...
#################
for i in range(52/2):
    if random.randint(0,2)==0:
        twoLayer()
    else:
        threeLayer()

# twoLayer()
wn = trtl.Screen()
wn.mainloop()