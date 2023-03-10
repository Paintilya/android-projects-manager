package dev.paintilya.android_projects_manager.BLL.Model;

import java.util.List;

import dev.paintilya.android_projects_manager.DAL.IExpenseDAO;
import dev.paintilya.android_projects_manager.DAL.IPaymentMethodDAO;

public class Expense {
    private int id, projectId;
    private String name;
    private double amount;

    public Expense() {}
    public Expense(int id, int projectId, String name, double amount) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.amount = amount;
    }

    public boolean isPaid(IPaymentMethodDAO dao) {
        List<PaymentMethod> transactions = dao.getAllPaymentMethods();
        for (PaymentMethod transaction : transactions) {
            if (transaction.getExpenseId() == this.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
