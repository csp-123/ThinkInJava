package com.csp;

/**
 * 元组，将一组对象直接打包存储于其中的一个单一对象，这个容器对象允许读取其中的对象，不允许存放。
 * @param <A>
 * @param <B>
 */
public class TwoTuple<A,B> {

    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

/**
 * 可以使用继承机制实现长度更长的元组
 * @param <A>
 * @param <B>
 * @param <C>
 */
class TreeTuple<A,B,C> extends TwoTuple<A,B>{

    public final C third;


    public TreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "TreeTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
