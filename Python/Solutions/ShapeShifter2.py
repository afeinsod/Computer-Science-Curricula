import turtle

bob = turtle.Turtle()

answer = str(raw_input("Do you want to draw a shape? "))


if ((answer=="yes") | (answer=="y")):
	color = str(raw_input("What color would you like? "))
	size = int(raw_input("What pen size would you like? "))
	length = int(raw_input("What side length would you like? "))
	sides = int(raw_input("How many sides should the shape have? "))
	bob.pensize(size)
	bob.color(color)
	counter=0
	while (counter<sides):
		bob.forward(length)
		bob.left(360./sides)
		counter +=1
	turtle.exitonclick()
else:
	turtle.bye()


