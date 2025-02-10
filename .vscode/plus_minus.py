def plusMinus(arr):
    negative_arr=[]
    positive_arr=[]
    zero_arr=[]
    for i in arr:
        if i <0:
            negative_arr.append(i)
        elif i >0:
            positive_arr.append(i)    

        elif i==0:
            zero_arr.append(i)

        No_positive=len(positive_arr)
        No_negative=len(negative_arr)
        No_zero=len(zero_arr)
        
        r1=No_positive/n
        r2=No_negative/n
        r3=No_zero/n

    print(round(r1,6))
    print(round(r2,6))
    print(round(r3,6))

n=int(input("enter the size"))
arr=list(map(int,(input().split())))
plusMinus(arr)