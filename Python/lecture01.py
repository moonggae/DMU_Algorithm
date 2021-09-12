def greedy():
    coinCount, cost = input().split()
    coinCount = int(coinCount)
    cost = int(cost)
    answerCount = 0

    coinTypes = []

    for i in range(0, coinCount):
        coinTypes.append(int(input()))

    coinTypes.sort(reverse=True)

    for i in range(0, len(coinTypes)):
        answerCount += cost // coinTypes[i]
        cost %= coinTypes[i]
        
    
    print(answerCount)