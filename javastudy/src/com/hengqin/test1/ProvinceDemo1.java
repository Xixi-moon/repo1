package com.hengqin.test1;

class Province{
    private int pid;
    private String pname;
    private City1 [] cities;
    public void setCities(City1 [] cities){
        this.cities=cities;
    }
    public City1 [] getCities(){
        return cities;
    }
    public Province(int pid,String pname){
        this.pid=pid;
        this.pname=pname;
    }
    public String getInfo(){
        return "省份编号"+this.pid+"省份名称"+this.pname;
    }

}
class City1{
    private int cid;
    private String cname;
    private Province province;
    public void setProvince(Province province){
        this.province=province;
    }
    public Province getProvince(){
        return province;
    }
    public City1(int cid,String cname){
        this.cid=cid;
        this.cname=cname;
    }
    public String getInfo(){
        return "城市编号"+this.cid+"城市名称"+this.cname;
    }
}
public class ProvinceDemo1 {
    public static void main(String[] args) {
        //准备对象
        Province province1 = new Province(1,"jiangsu");
        City1 city1 = new City1(1,"yangzhouo");
        City1 city2 = new City1(2,"yancheng");
        City1 city3 = new City1(3,"huaian");
        //设置关系
        city1.setProvince(province1);
        city2.setProvince(province1);
        city3.setProvince(province1);

        province1.setCities(new City1[]{city1,city2,city3});
        //取出
        System.out.println(city1.getInfo());
        System.out.println(city1.getProvince().getInfo());
        System.out.println(province1.getInfo());
        for (int x = 0; x <province1.getCities().length;x++){
            System.out.println(province1.getCities()[x].getInfo());
        }

    }
}
