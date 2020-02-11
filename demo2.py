def chk_pal(slist):
    result =[]
    for data in slist:
        
        if data[::-1].lower()==data.lower():
            result.append(data)
    return(result)
def main():
    num=int(input("enetr number"))
    data=[]
    for i in range(0,num):
        data.append(str(input()))
    print(data)
    result=chk_pal(data)
    if(len(result))==0:
        print("no pal")
    else:
        for ls in result:
            print(ls)
main()
