//
//  marty_1008.swift
//  Algoritm
//
//  Created by Kim Marty on 2021/09/26.
//

import Foundation

func marty_1008(){
    let str = readLine() ?? ""
    let arr = str.split(separator: " ")
    
    let A = Double(arr[0]) ?? 0
    let B = Double(arr[1]) ?? 0
    
    print(A / B)
}
