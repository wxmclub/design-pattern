/*
MIT License

Copyright (c) 2018 wxmclub@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.wxmclub.demo.designpattern.proxy.demo1;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2018-04-18
 */
public class FoodServiceProxy implements FoodService {

    private FoodService foodService;

    public FoodServiceProxy(FoodService foodService) {
        this.foodService = foodService;
    }

    @Override
    public void makeChicken() {
        System.out.println("开始制作鸡肉");
        foodService.makeChicken();
        System.out.println("加入盐");
        System.out.println("鸡肉制作完成");
    }

    @Override
    public void makeNoodle() {
        System.out.println("开始制作面条");
        foodService.makeNoodle();
        System.out.println("盛出面条");
    }
}
