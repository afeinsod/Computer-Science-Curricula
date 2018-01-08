import turtle

bob = turtle.Turtle()

color = str(raw_input("What color would you like? "))
size = int(raw_input("What pen size would you like? "))
length = int(raw_input("What side length would you like? "))
answer = str(raw_input("Do you want to draw a square? "))
if ((answer=="yes") | (answer=="y")):
	bob.pensize(size)
	bob.color(color)
	bob.forward(length)
	bob.left(90)
	bob.forward(length)
	bob.left(90)
	bob.forward(length)
	bob.left(90)
	bob.forward(length)
	turtle.exitonclick()
else:
	turtle.bye()


