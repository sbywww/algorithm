//
//  marty_10951.swift
//  Swift_ExecuteProj
//
//  Created by Kim Marty on 2021/10/31.
//

import Foundation

func marty_10951(){
    var flag = true
    while flag{
        if let str = readLine(){
            let arr = str.split(separator: " ")
            
            let A = Int(arr[0]) ?? 0
            let B = Int(arr[1]) ?? 0
            
            print(A + B)
        }else{
            flag = false
        }
    }
    
    
    
}
