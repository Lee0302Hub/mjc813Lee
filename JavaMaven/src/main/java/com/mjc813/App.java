package com.mjc813;
import com.mjc813.mjc_library.IMarketInfo;
import com.mjc813.mjc_library.MjcPoint;
/**
 * Hello world!
 *- com.mjc813.mjc_library.IMarketInfo 인터페이스를 구현하는 클래스를 만드세요.
 * - com.mjc813.mjc_library.MjcPoint 클래스를 public static void main 안에서 인스턴스하고
 * 	addPoint 와 subPoint 메소드를 실행하세요.
 */
public class App 
{
    public static void main( String[] args )
    {
        MarketInfo info;
        MjcPoint mp = new MjcPoint();
        //mp.addPoint(new MarketInfo(), 5);
        mp.subPoint(new MarketInfo(), 5);
    }
}
