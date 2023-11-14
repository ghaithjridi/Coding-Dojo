
# def countdown():

#     for i in range(5, -1, -1):
#         print(i)

# countdown()

# def main():
#     num1 = int(input('5'))
#     num2 = int(input('6'))
#     return num1, num2
#     max(n1, n2)
#     print(max)

# def max(n1, n2):
#     return max
    
# main()

# def first_plus_length(num_list):
#     print( num_list[0]+len(num_list))
# first_plus_length([1,2,3,4,5])



def values_greater_than_second(arr):
    if (len(arr)) < 2 :
        return (False)
    arr1=[]
    for i in arr:
        if arr[i]>arr[1]:
            arr1.append(arr[i])
    print(len(arr1))
    return(arr1)

print(values_greater_than_second([5,2,3,2,1,4]))



