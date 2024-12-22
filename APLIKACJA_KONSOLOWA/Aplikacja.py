class SelectionSorter:
    def __init__(self):
        self.array: list =[]

    #********************************************************
    #* nazwa funkcji:       sort
    #* parametry wejściowe: brak
    #* wartość zwracana:    brak 
    #* autor:               Ja
    #* ****************************************************

    def sort(self):
        for i in range(len(self.array)):
            max_index = self.max_value(i,None)
            self.array[i], self.array[max_index] = self.array[max_index], self.array[i]


    #********************************************************
    #* nazwa funkcji:       max_value
    #* parametry wejściowe: start - poczatek zakresu listy
    #                       stop - koniec zakresu listy
    #* wartość zwracana:    greatest_index - int - indeks najwyzszej wartosci
    #* autor:               Ja
    #* ****************************************************

    def max_value(self,start,stop):
        if start is None:
            start = 0
        if stop is None:
            stop = len(self.array)

        greatest_index = None
        for i in range(start,stop):
            if greatest_index is None or self.array[i] > self.array[greatest_index]:
                greatest_index = i
        return greatest_index

if __name__ == "__main__":
    sort = SelectionSorter()
    for i in range(10):
        array_value = int(input(f"Wprowadz wartosc: {i+1}: "))
        sort.array.append(array_value)

    print("Wprowadzona Tablica: ")
    print(sort.array)

    sort.sort()
    print("Posortowana tablica: ")
    print(sort.array)

