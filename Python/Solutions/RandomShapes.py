import random
import turtle

bob = turtle.Turtle()

counter =0
while (counter<10):
	counter +=1
	bob.penup()
	bob.goto(random.randint(-300,300), random.randint(-300,300))
	bob.pendown()
	bob.pensize(random.randint(1,10))
	bob.color(random.choice(["red", "orange", "yellow", "green", "blue", "purple"]))
	sides=random.randint(3, 15)
	drawn=0
	length = random.randint(10,100)
	while (drawn<sides):
		bob.forward(length)
		bob.left(360./sides)
		drawn +=1