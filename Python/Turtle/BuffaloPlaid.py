import turtle as t
wn=t.Screen()
wn.bgcolor('red')
a=t.Turtle(shape='square')
a.turtlesize(4)
a.color('black')
a.penup()
x=-353
for i in range(7):
    y=290
    for i in range(5):
        a.goto(x,y)
        a.pendown()
        a.stamp()
        a.penup()
        y-=160
    x+=83
    y=210
    for i in range(5):
        a.goto(x,y)
        a.pendown()
        a.stamp()
        a.penup()
        y-=160
    x+=83
wn.mainloop()