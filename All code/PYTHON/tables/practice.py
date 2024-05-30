with open("file.tt" ,"w") as f:
      uo= f.write("you are the best")
      print(uo)
class sum:
      def so(self):
            return self.a + self.b

num = sum()
num.a = 23
num.b = 12
s=num.so()
print(s)
class remote():
      def leftpressed(true):
            None

class player:
      def moveright(self):
            pass
      def moveleft(self):
            pass
      def movetop(self):
            pass

remote1 = remote()
player1 = player
if(remote.leftpressed(True)):
      player.moveleft


class employee:
      company = "Microsoft"

ruchika = employee()
om = employee()
ruchika.company = "google"
print(ruchika.company)
print(om.company)
ruchika.salary="1000000000"
print(ruchika.salary)


class em:
      complany ="microsoft"
      def getsalary(self):
            print("my salary is the best in the world")

ruchi = em()
print(ruchi.getsalary())

class employee:
      company = "Google"

      def showdetail(self):
            print("This is detail")
class programmer(employee):
      language = "Python"

      def lan(self):
            print(f"use your {self.language}")


e = employee()
p = programmer()
p.showdetail()

# @classmethod
# def change(cls,self):
# cls .salary = sal
# self._class_.salary = sal

# @totalsalary.setter
# def totalsalary(self,val):
#       return self.bonus= val - self.salary

class c2d:
      def __init__(self ,i,j) :
            self.i = i
            self.j = j
      def detail(self):
            return f"{self.i}i + {self.j}j"
class c3d(c2d):
      def __init__(self, i, j,k):
            super().__init__(i,j)
            self.k = k
      def detail(self):
            return f"{self.i}i + {self.j}j + {self.k}k"

v2d = c2d(2,3)
v3d = c3d(2,2,4)
print(v2d.detail())
print(v3d.detail()) 