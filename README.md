# SortingAlgorithmsUsingJava
Implementation of sorting algorithm using java

#First Implementation of bubble sort
#Pseudo code
#for i to length-1
    for j to length-1-i
    if list[j]>list[j+1]
    swap(list[j], list[j+1])
    end if
end j
end i
 
 #Insertion Sort
 Remember elements on left should always be sorted.
 #Pseudo
 for i to length
    key=element at i
    j=i-1
    while j<0 && element at j>key
    swap(list[j], list[j+1])
    j--
    end while
 end for
 
 #Selection Sort
 Remember list is scanned for minValue.
 #Pseudo
 
 for i to length
 minValue=element at i
    for j=i to length
        if minValue>element at j
        swap minValue,element at J
        end j
 end i
    
 
    
