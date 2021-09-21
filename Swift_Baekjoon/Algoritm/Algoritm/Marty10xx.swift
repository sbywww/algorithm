//
//  Marty1000.swift
//  Algoritm
//
//  Created by Kim Marty on 2021/09/21.
//

import Foundation

func marty_1000(){
    let str = readLine() ?? ""
    let arr = str.split(separator: " ")
    
    let A = Int(arr[0]) ?? 0
    let B = Int(arr[1]) ?? 0
    
    print(A + B)
}
