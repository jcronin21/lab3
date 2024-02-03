def has_duplicates(nums):
    num_set = set(nums)
    return len(nums) != len(num_set)

this_is_a_set = {1, 2, 3, 4, 4}
#this_is_a_set = {1,2,3,4}
#uncomment the above for true
printset = has_duplicates(this_is_a_set)
print(printset)

#for x in this_is_a_set:
 #   print(x)





