#Initializing lists:
#To initiazlie an empty list: 
my_list = [] 
#To initiate a list with values (can contain mixed types): 
list2 = [1, "yay", 140.76]


#Finding information about a list: 
#To get an item from a list by index: 
my_list= [1, 2, 3, 4, 5, 6]
print my_list[0]  #will give the first item in the list, which is 1
print my_list[3]  #will give the 4th item in the list, which is 4
#To get the length: 
length = len(my_list)
print "The length is",length
#To get the largest element of the list:
print "The maximum is", max(my_list)
#To get the smallest element of the list:
print "The minimum is", min(my_list) 
#To find out if something is in the list: 
print "3 is in the list:",(3 in my_list) 
print "14 is in the list:",(14 in my_list) 


# Adding to a list: 
# To add something at the end of the list: 
my_list.append(8)
print my_list
# To insert something at a certain index in the list: insert(index, object)
my_list.insert(6, 7)
print my_list
# To change a value in a list: 
my_list[3] = 12  
print my_list


# Removing from a list:
# To delete something from a list: 
del my_list[2]
print my_list
# To delete a specific object from the list: 
my_list.remove(5) 
print my_list
