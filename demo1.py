class cname:
    def numsum(self,n1,n2):
        result=n1+n2
        return result
    
    def numsub(self,n1,n2):
        result=n1-n2
        return result
    
    def nummul(self,n1,n2):
        result=n1*n2
        return result

    def __init__(self):
        num1=int(input("enter num1"))
        num2=int(input("enter num2"))
        resultsum=self.numsum(num1,num2)
        resultsub=self.numsub(num1,num2)
        resultmul=self.nummul(num1,num2)
        print(resultsum)
        print(resultsub)
        print(resultmul)
    

if __name__=="__main__":
    obj=cname()
    
