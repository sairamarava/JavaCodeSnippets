import sys

def generateResult(N, M, commands):
    robots = list(range(1, N + 1))
    for cmd in commands:
        parts = cmd.split()
        t, X, Y = parts[0], int(parts[1]), int(parts[2])
        robots.remove(X)
        idx = robots.index(Y)
        if t == 'A': 
            robots.insert(idx, X)
        else:  
            robots.insert(idx + 1, X)
    target = list(range(1, N + 1))
    pos = {val: i for i, val in enumerate(target)}
    arr = [pos[val] for val in robots]
    import bisect
    lis = []
    for num in arr:
        idx = bisect.bisect_left(lis, num)
        if idx == len(lis):
            lis.append(num)
        else:
            lis[idx] = num

    return N - len(lis)


if __name__ == "__main__":
    input = sys.stdin.read
    data = input().strip().split('\n')

    N, M = map(int, data[0].split())
    commands = [data[i].strip() for i in range(1, M + 1)]

    print(generateResult(N, M, commands))
