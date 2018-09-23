def quicksort(array, left, right):
    if (left < right):
        index = partition(array, left, right)
        quicksort(array, left, index - 1)
        quicksort(array, index + 1, right)


def partition(array, left, right):
    pivot = array[right]
    boundary = left - 1
    for j in range(left, right):
        if array[j] <= pivot:
            boundary += 1
            swap(array, boundary, j)
    swap(array, boundary + 1, right)
    return boundary + 1


def swap(array, i, j):
    array[i], array[j] = array[j], array[i]



if __name__ == "__main__":
    array = [2, 8, 7, 1, 3, 5, 6, 4, 10000]
    quicksort(array, 0, len(array) - 1);
    print(array)
