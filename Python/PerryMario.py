ui = int(input("Height: "))
var=1
for i in range(ui):
    spaces=" "*(ui-((ui-(ui-var))))
    blocks="#"*(ui-(ui-var))
    print(f'{spaces}{blocks} {blocks}')
    var=var+1

