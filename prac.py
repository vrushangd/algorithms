a = [2,3,5,4,1]
n=len(a)
for k in range(1,n-1,1):
    for i in range(0,n-2,1):
        if a[i] > a[i+1]:
            temp = a[i]
            a[i]=a[i+1]
            a[i+1]=temp
            print(a[i])

print(a)
