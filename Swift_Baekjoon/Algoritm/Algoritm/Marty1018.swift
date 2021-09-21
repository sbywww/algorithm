//
//  Marty1018.swift
//  Algoritm
//
//  Created by Kim Marty on 2021/09/21.
//

import Foundation

func marty_1018(){
    let CNT = 8
    let str = readLine() ?? ""
    let arr = str.split(separator: " ")
    let M = Int(arr[0]) ?? 0
    let N = Int(arr[1]) ?? 0
    
    var countW = 0
    var countB = 0
    var chessBoard : [[Character]] = []
    for _ in 0..<M{
        var line = readLine() ?? ""
        var array = [Character]()
        for _ in 0..<N{
            array.append(line.first!)
            line.removeFirst()
        }
        chessBoard.append(array)
    }
    var minPaintCnt = Int.max
   
    let nMax = N - CNT + 1
    let mMax = M - CNT + 1
    for mDist in 0..<(mMax){
        for nDist in 0..<(nMax){
            countW = 0
            countB = 0
            for wb in 0..<2{
                for n in 0..<CNT{
                    for m in 0..<CNT{
                        let i_idx = m+mDist , j_idx = n+nDist
                        let tile = chessBoard[i_idx][j_idx]
                        let sum = i_idx + j_idx
                        if wb == 0{ //  WHITE BASE
                            if (sum % 2 == 0 && tile != "W") || (sum % 2 != 0 && tile == "W"){
                                countW += 1
                            }
                        }else{
                            if (sum % 2 == 0 && tile != "B") || (sum % 2 != 0 && tile == "B"){
                                countB += 1
                            }
                        }
                        
                
                    }
                
                }
            }
            if minPaintCnt > countW {
                minPaintCnt = countW
            }
            if minPaintCnt > countB {
                minPaintCnt = countB
            }
        }
       
    }
    
    print(minPaintCnt)
    
    
    
}
