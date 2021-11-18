

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageRestaurants;

/**
 *
 * @author  monal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        //this.account=account;
      
        valueLabel.setText(account.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageRestoInfo = new javax.swing.JButton();
        manageMenu = new javax.swing.JButton();
        manageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageRestoInfo.setBackground(new java.awt.Color(8, 34, 137));
        manageRestoInfo.setForeground(new java.awt.Color(255, 255, 255));
        manageRestoInfo.setText("Manage Restaurant Info");
        manageRestoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestoInfoActionPerformed(evt);
            }
        });
        add(manageRestoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 310, -1));

        manageMenu.setBackground(new java.awt.Color(8, 34, 137));
        manageMenu.setForeground(new java.awt.Color(255, 255, 255));
        manageMenu.setText("Manage menu");
        manageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuActionPerformed(evt);
            }
        });
        add(manageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 310, -1));

        manageOrders.setBackground(new java.awt.Color(8, 34, 137));
        manageOrders.setForeground(new java.awt.Color(255, 255, 255));
        manageOrders.setText("Manage Orders");
        manageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersActionPerformed(evt);
            }
        });
        add(manageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 310, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRestoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestoInfoActionPerformed
        // TODO add your handling code here:
        
        ManageInfo manageInfo=new ManageInfo(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_manageRestoInfoActionPerformed

    private void manageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuActionPerformed
         ManageMenu manageMenu=new ManageMenu(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageMenu);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMenuActionPerformed

    private void manageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageMenu;
    private javax.swing.JButton manageOrders;
    private javax.swing.JButton manageRestoInfo;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
