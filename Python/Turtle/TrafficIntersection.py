import turtle as t
t.speed(0)
wn=t.Screen()
wn.bgcolor('skyblue')
def yellow():
    a=t.Turtle(shape='square')
    a.turtlesize(2)
    a.color('yellow')
    a.penup()
    x=-360
    y=333
    for i in range(30):
        a.goto(x,0)
        a.pendown()
        a.stamp()
        x+=25
    a.penup()
    for i in range(30):
        a.goto(0,y)
        a.pendown()
        a.stamp()
        y-=25
    a.penup()
    a=t.Turtle(shape='square')
    a.turtlesize(1)
    a.color('grey')
    a.penup()
    x=-380
    y=380
    for i in range(40):
        a.goto(x,0)
        a.pendown()
        a.stamp()
        x+=20
    a.penup()
    for i in range(40):
        a.goto(0,y)
        a.pendown()
        a.stamp()
        y-=20
    a.penup()
def middle():
    a=t.Turtle(shape='square')
    a.color('grey')
    a.turtlesize(9)
    a.goto(0,0)
    a.pendown()
    a.stamp()
    a.penup()
def road():
    a=t.Turtle(shape='square')
    a.turtlesize(9)
    a.color('grey')
    a.penup()
    x=-333
    y=333
    for i in range(30):
        a.goto(x,0)
        a.pendown()
        a.stamp()
        x+=25
    a.penup()
    for i in range(30):
        a.goto(0,y)
        a.pendown()
        a.stamp()
        y-=25
    a.penup()
def white():
    a=t.Turtle(shape='square')
    a.turtlesize(.5)
    a.color('white')
    a.penup()
    y1=-50
    x2=-50
    for i in range (2):
        x1=-343
        y2=333
        for i in range(30):
            a.goto(x1,y1)
            a.pendown()
            a.stamp()
            a.penup()
            x1+=40
        a.penup()
        for i in range(30):
            a.goto(x2,y2)
            a.pendown()
            a.stamp()
            a.penup()
            y2-=40
        a.penup()
        y1=50
        x2=50
def turtles():
    horiz_turtles = []
    vert_turtles = []

    #create the turtles
    
    ht = t.Turtle(shape="turtle")
    horiz_turtles.append(ht)
    ht.penup()
    ht.fillcolor("yellow")
    ht.goto(-350,-65)
    ht.speed(0)
    ht.setheading(0)
    
    ht2 = t.Turtle(shape="turtle")
    horiz_turtles.append(ht2)
    ht2.penup()
    ht2.fillcolor("blue")
    ht2.goto(350,65)
    ht2.speed(10)
    ht2.setheading(180)
    
    vt2 = t.Turtle(shape="turtle")
    horiz_turtles.append(vt2)
    vt2.penup()
    vt2.fillcolor("red")
    vt2.goto(65,-350)
    vt2.speed(5)
    vt2.setheading(90)
    
    vt = t.Turtle(shape="turtle")
    vert_turtles.append(vt)
    vt.penup()
    vt.fillcolor("green")
    vt.speed(10)
    vt.goto(-65,350)
    vt.setheading(270)
        
    

    #moving the turtles
    distanceToMove=2
    collisionDistance=5
    #check for collision
    
    #for h in horiz_turtles():
    #    for v in vert_turtles():
    #        while not(abs(h.xcor() - v.xcor()) < collisionDistance)and not(abs(h.ycor()-v.ycor()) < collisionDistance):
    #            for step in range(375):
    #                h.fd(distanceToMove)
    #                v.fd(distanceToMove)
    #        else:
    #            h.stamp()
    #            h.hideturtle()
    #            v.stamp()
    #            v.hideturtle()
    while True:
        for h in horiz_turtles:
            for v in vert_turtles:
                if ht.xcor()>=350:
                    ht.goto(-350,-65)
                elif ht2.xcor()<=-350:
                    ht2.goto(350,65)
                elif vt.ycor()<=-350:
                    vt.goto(-65,350)
                elif vt2.ycor()>=350:
                    vt2.goto(65,-350)   
                v.fd(distanceToMove)
                h.fd(distanceToMove)
    
                #check for collision
                if(abs(h.xcor() - v.xcor()) < collisionDistance):
                    if (abs(h.ycor()-v.ycor()) < collisionDistance):
                        h.fillcolor("red")
                        v.fillcolor("red")
                        h.stamp()
                        v.stamp()
                        horiz_turtles.remove(h)
                        vert_turtles.remove(v)
                    
road()
yellow()
white()
middle()
turtles()
wn.mainloop()