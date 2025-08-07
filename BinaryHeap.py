class Heap:

    def __init__(self):
        self.__arr = [0]
        self.__ind = 0

    def insert(self,val):
        self.__arr.append(val)
        self.__ind +=1
        self.__sifting_up(self.__ind)


    def pop(self):
        for_return = self.__arr[1]

        if self.__ind == 0:
            raise Exception("Куча пуста")

        max_val = self.__arr[1]
        self.__arr[1] = self.__arr[self.__ind]
        self.__arr.pop()
        self.__ind -= 1
        if self.__ind > 0:
            self.__sifting_down(1)
        return max_val

    def max(self):
        if len(self.__arr) > 0:
            return self.__arr[1]
        raise "Нет элемениов в куче"


    def __sifting_up(self, ind):
        if ind == 1:
            return

        if self.__arr[ind // 2] < self.__arr[ind]:
            self.__arr[ind // 2], self.__arr[ind] = self.__arr[ind], self.__arr[ind // 2]
            return self.__sifting_up(ind // 2)

        return

    def __sifting_down(self, ind):
        if ind * 2 > self.__ind:
            return

        left = ind * 2
        right = ind * 2 + 1
        largest = ind

        if left <= self.__ind and self.__arr[left] > self.__arr[largest]:
            largest = left
        if right <= self.__ind and self.__arr[right] > self.__arr[largest]:
            largest = right

        if largest != ind:
            self.__arr[ind], self.__arr[largest] = self.__arr[largest], self.__arr[ind]
            self.__sifting_down(largest)

    def is_empty(self):
        return self.__ind == 0


    def _printArr(self):
        print(self.__arr[1:])


hp = Heap()

hp.insert(3)
hp.insert(4)
hp.insert(5)
hp.insert(6)


hp._printArr()
hp.pop()
hp._printArr()
hp.pop()
hp._printArr()
