package vn.iotstar.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.iotstar.entity.Category;

public class Test {

    public static void main(String[] args) {
        // Lấy EntityManager từ JPAConfig
        EntityManager enma = JPAConfig.getEntityManager();
        EntityTransaction trans = enma.getTransaction();

        // Tạo đối tượng Category
        Category cate = new Category();
        cate.setCategoryname("Iphone");
        cate.setImages("abc.jpg");
        cate.setStatus(1);

        try {
            // Bắt đầu giao dịch
            trans.begin();

            // Lưu đối tượng Category vào cơ sở dữ liệu
            enma.persist(cate);

            // Commit giao dịch
            trans.commit();
        } catch (Exception e) {
            // Xử lý lỗi và rollback nếu có
            e.printStackTrace();
            trans.rollback();
            throw e;
        } finally {
            // Đóng EntityManager
            enma.close();
        }
    }
}
