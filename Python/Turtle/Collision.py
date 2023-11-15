#everything from turtle
from turtle import *

# create two empty lists of turtles, adding to them later
horiz_turtles = []
vert_turtles = []

# use interesting shapes and colors
turtleShapes = ["arrow", "turtle", "circle", "square", "triangle", "classic"]
horizColors = ["red", "blue", "green", "orange", "purple", "gold"]
vertColors = ["darkred", "darkblue", "lime", "salmon", "indigo", "brown"]

#create the turtles
spacing=50
for shape in turtleShapes:
    ht = Turtle(shape=shape)
    horiz_turtles.append(ht)
    ht.penup()
    ht.fillcolor(horizColors.pop())
    ht.goto(-250,spacing)
    ht.setheading(0)
   
    vt = Turtle(shape=shape)
    vert_turtles.append(vt)
    vt.penup()
    vt.fillcolor(vertColors.pop())
    vt.goto(-spacing,250)
    vt.setheading(270)
    
    spacing+=25

#moving the turtles
distanceToMove=2
collisionDistance=5
for step in range(100):
    for h in horiz_turtles:
        for v in vert_turtles:
            v.fd(distanceToMove)
            h.fd(distanceToMove)

            #check for collision
            if(abs(h.xcor() - v.xcor()) < collisionDistance):
                if (abs(h.ycor()-v.ycor()) < collisionDistance):
                    h.fillcolor("gray")
                    v.fillcolor("gray")
                    horiz_turtles.remove(h)
                    vert_turtles.remove(v)
wn = Screen()
wn.mainloop()