#### 1. 简单的swing组件的使用
#### 2. 知道什么是 awt,swing,swt,JFace
1. Sun 已经提供一个跨平台GUI开发工具包AWT抽象窗口工具箱(Abastract Window Toolkit).
2. Sun又创建一个新的GUI框架swing，来解决awt存在的lcd问题（本地化问题）。
3. IBM认为swing比较消耗内存，创建来一个新的GUI库，SWT。
4. IBM为了方便开发SWT程序，又在SWT基础上开发来一个更易用，功能强大的图像包JFace。
#### 3. 掌握常用的布局管理器
1. 概念：
组件在容器（如JFarme）中的位置和大小由布局管理器来控制
2. 种类：
    - 流式布局管理器（FlowLayout）
    - 边界布局管理器（BorderLayout）
        - 1. 不需要5个部分都添加
        - 2. 中部组件会自动适应大小
        - 3. JFrame，JDialog 默认是边界布局。
    - 网格布局管理器（GridLayout）
    - 卡片布局管理器（CardLayout）
    - 网格包布局管理器（GridBagLayout）
    
    **其中前三种是最常见的布局管理器**
#### 4. 学会使用IDE做Java程序开发