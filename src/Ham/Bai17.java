package Ham;

public class Bai17 {
    public static void main(String[] args) {
        String[] stringtArray = {"Ánh", "Tâm", "Công"}; //mảng ban đầu
        String value = "Trang"; // phần tử cần thêm vào đầu mảng
        String[] resultArray = addElementToStarArray(stringtArray, value);
        for (String item : resultArray) {
            System.out.println(item);
        }
    }

    public static String[] addElementToStarArray(String[] inputArray, String value) {
        String[] newArray = new String[inputArray.length + 1]; //tạo 1 mảng mới với kích thước lớn hơn mảng cũ 1 đơn vị
        newArray[0] = value;  //gán phần tử mới vào đầu mảng mới
        System.arraycopy(inputArray, 0, newArray, 1, inputArray.length); //sao chep các phần tử từ mảng cũ vào mảng mới, bắt đầu từ chỉ số index 1
        return newArray;
    }

}
