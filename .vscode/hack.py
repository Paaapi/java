
def diagonalDifference(arr):
    n=len(arr)
    left_diagonal_sum=[]
    right_diagonal_sum=[]
    for i in range(n):
        left_diagonal=[arr[i][i]]
        right_diagonal=[arr[i][n-i-1]]
        left_diagonal_sum.append(left_diagonal)
        right_diagonal_sum.append(right_diagonal)
    d1_sum=sum(left_diagonal_sum)
    d2_sum=sum(right_diagonal_sum)    
    result=abs(d1_sum-d2_sum)
    return result    

n=int(input())
arr=[]
for _ in range(n):
    row=list(map(int,input().split()))
    arr.append(row)
    
res=diagonalDifference(arr)
print(res)