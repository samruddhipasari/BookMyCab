/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Uber.Car;
import Uber.CarInfo;
import Uber.Search;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samruddhi
 */
public class SearchCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchCarJPanel
     */
    private CarInfo carInfo;
    private JPanel rightPanel;
    private Search searchCar;
    private ArrayList<Car> resultList;

    public SearchCarJPanel(JPanel rightPanel, CarInfo carInfo) {
        initComponents();
        this.rightPanel = rightPanel;
        this.carInfo = carInfo;
        populateCityList();    
        populateManuList();
    }
    
    public ArrayList<Car> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Car> resultList) {
        this.resultList = resultList;
    }

    private void populateCityList(){

        int i = 0;    
        DefaultListModel model = new DefaultListModel();
        cityList.setModel(model);
        for(Car car: carInfo.getCarInfo()){
            if(!(model.contains(car.getCity()))){
                model.add(i, car.getCity());
                i++;
            }
        }
    }
    
    private void populateManuList(){

        int i = 0;
        DefaultListModel model = new DefaultListModel();
        manuList.setModel(model);
        for(Car car: carInfo.getCarInfo()){
            if(!(model.contains(car.getManufacturer()))){
                model.add(i, car.getManufacturer());
                i++;
            }
        }
    }
    
    private void setFieldEnabled(boolean b){
        
        manuTextField.setEnabled(b);
        manuYearTextField.setEnabled(b);
        serialNumTextField.setEnabled(b);
        modelNumTextField.setEnabled(b);
        cityTextField.setEnabled(b);
        minSeatsTextField.setEnabled(b);
        maxSeatsTextField.setEnabled(b);
        firstAvailCheckBox.setEnabled(b);
        availCheckBox.setEnabled(b);
        manCertValidCheckBox.setEnabled(b);
    }
     
    private void clearField(boolean b){
        if(b == true){
            manuTextField.setText("");
            manuYearTextField.setText("");
            serialNumTextField.setText("");
            modelNumTextField.setText("");
            cityTextField.setText("");
            maxSeatsTextField.setText("");
            minSeatsTextField.setText("");
            firstAvailCheckBox.setSelected(false);
            availCheckBox.setSelected(false);
            manCertValidCheckBox.setSelected(false);
        }
    }
    
    private void setFilters(){
    
        Search searchCar = new Search();
        this.searchCar = searchCar;
        
        if(cityList.getSelectedValue() == null)
            searchCar.setCity("");
        else
            searchCar.setCity(cityList.getSelectedValue());
        if(manuList.getSelectedValuesList()== null)
            searchCar.setManufactList(null);
        else
            searchCar.setManufactList(new ArrayList(manuList.getSelectedValuesList()));
        searchCar.setFirstAvail(firstAvailCheckBox.isSelected());
        searchCar.setAvail(availCheckBox.isSelected());
        searchCar.setUnavail(unavailCheckBox.isSelected());
        searchCar.setValidManCert(manCertCheckBox.isSelected());
        searchCar.setExpManCert(expmanCertCheckBox.isSelected());
        
        if((yearTextField.getText()).equals(""))
            searchCar.setYear(0);
        else
            searchCar.setYear(Integer.parseInt(yearTextField.getText()));
        if((serialNumTextField.getText()).equals(""))
            searchCar.setSerial(0);
        else
            searchCar.setSerial(Integer.parseInt(serialNumTextField.getText()));
        if((modelNumTextField.getText()).equals(""))
            searchCar.setModel(0);
        else
            searchCar.setModel(Integer.parseInt(modelNumTextField.getText()));
        if((minSeatsTextField.getText()).equals(""))
            searchCar.setMinSeats(0);
        else
            searchCar.setMinSeats(Integer.parseInt(minSeatsTextField.getText()));
        if((maxSeatsTextField.getText()).equals(""))
            searchCar.setMaxSeats(0);
        else
            searchCar.setMaxSeats(Integer.parseInt(maxSeatsTextField.getText()));
        
    }
    
    private void clearFilters(){
        
        DefaultTableModel dtm = (DefaultTableModel)searchCarTable.getModel();
        dtm.setRowCount(0);
        cityList.clearSelection();
        manuList.clearSelection();
        firstAvailCheckBox.setSelected(false);
        availCheckBox.setSelected(false);
        unavailCheckBox.setSelected(false);
        manCertCheckBox.setSelected(false);
        expmanCertCheckBox.setSelected(false);
        yearTextField.setText("");
        serialNumTextField.setText("");
        modelNumTextField.setText("");
        minSeatsTextField.setText("");
        maxSeatsTextField.setText("");
        availNumTextField.setText(String.valueOf(0));
        unavailNumTextField.setText(String.valueOf(0));
    }
    
    private void resetFiltersValue(){
        
        this.searchCar = searchCar;
       
        searchCar.setCity("");
        searchCar.setManufactList(null);
        searchCar.setFirstAvail(false);
        searchCar.setAvail(false);
        searchCar.setUnavail(false);
        searchCar.setValidManCert(false);
        searchCar.setExpManCert(false);
        searchCar.setYear(0);
        searchCar.setSerial(0);
        searchCar.setModel(0);
        searchCar.setMinSeats(0);
        searchCar.setMaxSeats(0);
        searchCar.setAvailCount(0);
        searchCar.setUnavailCount(0);
    
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)searchCarTable.getModel();
        dtm.setRowCount(0);
        
        for(Car car: getResultList()){
            Object[] row = new Object[4];
            row[0] = car;
            row[1] = car.getYear_manufactured();
            row[2] = car.getCity();
            if(car.isAvailable()) 
                row[3] = "yes";
            else 
                row[3] = "no";
            
            dtm.addRow(row);
        }
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        splitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        btnApply = new javax.swing.JButton();
        filterLable = new javax.swing.JLabel();
        availCheckBox = new javax.swing.JCheckBox();
        manCertCheckBox = new javax.swing.JCheckBox();
        minSeatsLabel = new javax.swing.JLabel();
        minSeatsTextField = new javax.swing.JTextField();
        maxSeatsLabel = new javax.swing.JLabel();
        maxSeatsTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        yearManLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        serialLabel = new javax.swing.JLabel();
        serialNumTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelNumTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cityList = new javax.swing.JList<>();
        unavailCheckBox = new javax.swing.JCheckBox();
        expmanCertCheckBox = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();
        firstAvailCheckBox = new javax.swing.JCheckBox();
        cityLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manuList = new javax.swing.JList<>();
        bottomPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        searchCarTable = new javax.swing.JTable();
        availNumLabel = new javax.swing.JLabel();
        availNumTextField = new javax.swing.JTextField();
        unavailNumLabel = new javax.swing.JLabel();
        unavailNumTextField = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        manuLable = new javax.swing.JLabel();
        manuTextField = new javax.swing.JTextField();
        modelLable = new javax.swing.JLabel();
        manuYearTextField = new javax.swing.JTextField();
        serialNumLable = new javax.swing.JLabel();
        serialNumTextField1 = new javax.swing.JTextField();
        modelNumLable = new javax.swing.JLabel();
        modelNumTextField1 = new javax.swing.JTextField();
        cityLable = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        minSeatsLable = new javax.swing.JLabel();
        minSeatsTextField1 = new javax.swing.JTextField();
        maxSeatsLable = new javax.swing.JLabel();
        maxSeatsTextField1 = new javax.swing.JTextField();
        availLable = new javax.swing.JLabel();
        availCheckBox1 = new javax.swing.JCheckBox();
        manCertLable = new javax.swing.JLabel();
        manCertValidCheckBox = new javax.swing.JCheckBox();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setPreferredSize(new java.awt.Dimension(100, 64));
        jScrollPane3.setViewportView(jTable2);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnApply.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        filterLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        filterLable.setText("Filters");

        availCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availCheckBox.setText("Available Cars");

        manCertCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manCertCheckBox.setText("Vaild Maintenance Certificate");
        manCertCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manCertCheckBoxActionPerformed(evt);
            }
        });

        minSeatsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minSeatsLabel.setText("Minimum Seats:");

        minSeatsTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        maxSeatsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxSeatsLabel.setText("Maximum Seats:");

        maxSeatsTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("City:");

        yearManLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearManLabel.setText("Year of Manufcture:");

        yearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        serialLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serialLabel.setText("Serial Number:");

        serialNumTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        modelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelLabel.setText("Model Number:");

        modelNumTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cityList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cityList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(cityList);

        unavailCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unavailCheckBox.setText("Unavailable Cars");
        unavailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unavailCheckBoxActionPerformed(evt);
            }
        });

        expmanCertCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expmanCertCheckBox.setText("Expired Maintenance Certificate");
        expmanCertCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expmanCertCheckBoxActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        firstAvailCheckBox.setText("First Available");
        firstAvailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstAvailCheckBoxActionPerformed(evt);
            }
        });

        cityLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel1.setText("Manufacturer:");

        manuList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(manuList);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel)
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(44, 44, 44)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availCheckBox)
                            .addComponent(unavailCheckBox))
                        .addGap(13, 13, 13)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addComponent(expmanCertCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxSeatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addComponent(manCertCheckBox)
                                .addGap(27, 27, 27)
                                .addComponent(minSeatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addComponent(modelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addComponent(serialLabel)
                                .addGap(9, 9, 9)
                                .addComponent(serialNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(firstAvailCheckBox)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(filterLable))
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(yearManLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addComponent(filterLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearManLabel)
                                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cityLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstAvailCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel)
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(availCheckBox)
                                    .addComponent(manCertCheckBox)
                                    .addComponent(minSeatsLabel)
                                    .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unavailCheckBox)
                                    .addComponent(expmanCertCheckBox)
                                    .addComponent(maxSeatsLabel)
                                    .addComponent(maxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(topPanelLayout.createSequentialGroup()
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnApply, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(serialLabel)
                                        .addComponent(serialNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(modelLabel)
                                        .addComponent(modelNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnClear))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        splitPane.setTopComponent(topPanel);

        searchCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer", "Year Of Manufacture", "City", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(searchCarTable);

        availNumLabel.setText("Available Cars Count:");

        unavailNumLabel.setText("Unavailable Cars Count:");

        btnView.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        manuLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manuLable.setText("Manufacturer:");

        manuTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manuTextField.setEnabled(false);

        modelLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelLable.setText("Year of Manufacture:");

        manuYearTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manuYearTextField.setEnabled(false);

        serialNumLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serialNumLable.setText("Serial Number:");

        serialNumTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serialNumTextField1.setEnabled(false);

        modelNumLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelNumLable.setText("Model Number:");

        modelNumTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelNumTextField1.setEnabled(false);

        cityLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLable.setText("City of Availability:");

        cityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityTextField.setEnabled(false);

        minSeatsLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minSeatsLable.setText("Minimum Number of Seats:");

        minSeatsTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minSeatsTextField1.setEnabled(false);

        maxSeatsLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maxSeatsLable.setText("Maximum Number of Seats:");

        maxSeatsTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maxSeatsTextField1.setEnabled(false);

        availLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availLable.setText("Availability:");

        availCheckBox1.setEnabled(false);
        availCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availCheckBox1ActionPerformed(evt);
            }
        });

        manCertLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manCertLable.setText("Valid Maintenance Certificate:");

        manCertValidCheckBox.setEnabled(false);

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(availNumLabel)
                        .addGap(18, 18, 18)
                        .addComponent(availNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(unavailNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unavailNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availLable)
                            .addComponent(maxSeatsLable)
                            .addComponent(minSeatsLable)
                            .addComponent(cityLable)
                            .addComponent(modelLable)
                            .addComponent(manuLable)
                            .addComponent(manCertLable)
                            .addComponent(serialNumLable)
                            .addComponent(modelNumLable))
                        .addGap(53, 53, 53)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxSeatsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minSeatsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availCheckBox1)
                                    .addComponent(manCertValidCheckBox))
                                .addGap(210, 210, 210)))
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(462, 462, 462))))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availNumLabel)
                            .addComponent(availNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unavailNumLabel)
                            .addComponent(unavailNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(availLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manCertLable))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(availCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manCertValidCheckBox))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manuLable))
                        .addGap(18, 18, 18)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNumLable))
                        .addGap(18, 18, 18)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minSeatsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minSeatsLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxSeatsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxSeatsLable))
                        .addGap(65, 65, 65)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void manCertCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manCertCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manCertCheckBoxActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)searchCarTable.getModel();
        dtm.setRowCount(0);
        setFilters();
        this.resultList = new ArrayList<>();
        setResultList(searchCar.searchCarInfo(searchCar, carInfo));
        availNumTextField.setText(String.valueOf(searchCar.getAvailCount()));
        unavailNumTextField.setText(String.valueOf(searchCar.getUnavailCount()));
        populateTable();
    }//GEN-LAST:event_btnApplyActionPerformed

    private void expmanCertCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expmanCertCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expmanCertCheckBoxActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        setFieldEnabled(false);
        int selectRow = searchCarTable.getSelectedRow();

        if (selectRow >= 0){
            Car car = (Car)searchCarTable.getValueAt(selectRow, 0);
            manuTextField.setText(car.getManufacturer());
            manuYearTextField.setText(String.valueOf(car.getYear_manufactured()));
            serialNumTextField1.setText(String.valueOf(car.getSerialNum()));
            modelNumTextField1.setText(String.valueOf(car.getModelNum()));
            cityTextField.setText(car.getCity());
            minSeatsTextField1.setText(String.valueOf(car.getMinSeats()));
            maxSeatsTextField1.setText(String.valueOf(car.getMaxSeats()));
            availCheckBox1.setSelected(car.isAvailable());
            manCertValidCheckBox.setSelected(car.isMaintenanceCretValid());
        }
        else
        JOptionPane.showMessageDialog(null, "No Row to view", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnViewActionPerformed

    private void availCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availCheckBox1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearFilters();
        resetFiltersValue();
    }//GEN-LAST:event_btnClearActionPerformed

    private void unavailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unavailCheckBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_unavailCheckBoxActionPerformed

    private void firstAvailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstAvailCheckBoxActionPerformed
        // TODO add your handling code here:
        if(firstAvailCheckBox.isSelected()){
            unavailCheckBox.setEnabled(false);
            unavailCheckBox.setSelected(false);
        }
        else
            unavailCheckBox.setEnabled(true);
    }//GEN-LAST:event_firstAvailCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availCheckBox;
    private javax.swing.JCheckBox availCheckBox1;
    private javax.swing.JLabel availLable;
    private javax.swing.JLabel availNumLabel;
    private javax.swing.JTextField availNumTextField;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JLabel cityLable;
    private javax.swing.JList<String> cityList;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JCheckBox expmanCertCheckBox;
    private javax.swing.JLabel filterLable;
    private javax.swing.JCheckBox firstAvailCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JCheckBox manCertCheckBox;
    private javax.swing.JLabel manCertLable;
    private javax.swing.JCheckBox manCertValidCheckBox;
    private javax.swing.JLabel manuLable;
    private javax.swing.JList<String> manuList;
    private javax.swing.JTextField manuTextField;
    private javax.swing.JTextField manuYearTextField;
    private javax.swing.JLabel maxSeatsLabel;
    private javax.swing.JLabel maxSeatsLable;
    private javax.swing.JTextField maxSeatsTextField;
    private javax.swing.JTextField maxSeatsTextField1;
    private javax.swing.JLabel minSeatsLabel;
    private javax.swing.JLabel minSeatsLable;
    private javax.swing.JTextField minSeatsTextField;
    private javax.swing.JTextField minSeatsTextField1;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelLable;
    private javax.swing.JLabel modelNumLable;
    private javax.swing.JTextField modelNumTextField;
    private javax.swing.JTextField modelNumTextField1;
    private javax.swing.JTable searchCarTable;
    private javax.swing.JLabel serialLabel;
    private javax.swing.JLabel serialNumLable;
    private javax.swing.JTextField serialNumTextField;
    private javax.swing.JTextField serialNumTextField1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topPanel;
    private javax.swing.JCheckBox unavailCheckBox;
    private javax.swing.JLabel unavailNumLabel;
    private javax.swing.JTextField unavailNumTextField;
    private javax.swing.JLabel yearManLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
