package classloader;

import java.lang.reflect.InvocationTargetException;

public class ClassLoaderTest {

    public static void main(String[] args) {


        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            /** Java9之前的使用方式 */
            Class clazz = loader.loadClass("com.kxw.features.classloader.Car");
            Object obj = clazz.newInstance();
            Car car = (Car) obj;
            car.run();

        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (InstantiationException e) {
            System.err.println(e);
        } catch (IllegalAccessException e) {
            System.err.println(e);
        }

        try {
            /** Java9的使用方式 */
            Class clazz = loader.loadClass("com.kxw.features.classloader.Car");
            //Object obj = clazz.getDeclaredConstructor(String.class).newInstance("Benz");
            Object obj = clazz.getDeclaredConstructor().newInstance();
            Car car = (Car) obj;
            car.run();

        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (NoSuchMethodException e) {
            System.err.println(e);
        } catch (SecurityException e) {
            System.err.println(e);
        } catch (InstantiationException e) {
            System.err.println(e);
        } catch (IllegalAccessException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        } catch (InvocationTargetException e) {
            System.err.println(e);
        }

    }
}