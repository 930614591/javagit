package com.itwn.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.Map;
import java.util.Vector;

import javax.swing.JPanel;

import com.itwn.pojo.Boom;
import com.itwn.pojo.Bullet;
import com.itwn.pojo.hero;

public class MainViewPan extends JPanel implements KeyListener {// 键盘监听事件
	private int[][] map = new int[20][20];
	{
		map[0] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		map[1] = new int[] { 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0 };
		map[2] = new int[] { 0, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 3, 3, 3, 0 };
		map[3] = new int[] { 0, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 3, 3, 3, 0 };
		map[4] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		map[5] = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1 };
		map[6] = new int[] { 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1 };
		map[7] = new int[] { 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 };
		map[8] = new int[] { 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0 };
		map[9] = new int[] { 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0 };
		map[10] = new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0 };
		map[11] = new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		map[12] = new int[] { 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		map[13] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		map[14] = new int[] { 4, 4, 4, 4, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 4, 4, 4, 4 };
		map[15] = new int[] { 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4 };
		map[16] = new int[] { 4, 4, 4, 4, 0, 0, 0, 1, 1, 1, 1, 1, 0, 2, 2, 0, 4, 4, 4, 4 };
		map[17] = new int[] { 4, 4, 4, 4, 0, 2, 0, 1, 0, 0, 0, 1, 0, 2, 2, 0, 4, 4, 4, 4 };
		map[18] = new int[] { 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
		map[19] = new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

	}
	private Image ngImgImage = Toolkit.getDefaultToolkit().getImage("image/地面.jpg");// 背景图片
	// 显示背景,重写绘图的方法，打印组件

	// 砖头1
	private Image wallImgImage = Toolkit.getDefaultToolkit().getImage("image/砖墙.jpg");
	// 铁块2
	private Image stelsImage = Toolkit.getDefaultToolkit().getImage("image/铁块.jpg");
	// 水
	private Image warter1Img = Toolkit.getDefaultToolkit().getImage("image/水池.jpg");
	// 草4
	private Image grassImage = Toolkit.getDefaultToolkit().getImage("image/草地.jpg");
	// 英雄
	private Image heroImage = Toolkit.getDefaultToolkit().getImage("image/英雄.png");
	// Boss
	private Image bossImage = Toolkit.getDefaultToolkit().getImage("image/boss.png");
	// 炮弹
	private Image bulletImage = Toolkit.getDefaultToolkit().getImage("image/star.png");
	// 爆炸效果
	private Image boomImgImage;

	public MainViewPan() {
		// 构造方法
		// 加载英雄动图线程
		new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					heroCount++;// 英雄动图序号
					// boosCount++;//boss动图序号
					if (heroCount == heroValues.length) {
						heroCount = 0;// 英雄动图循环
					}
					// if (boosCount==bossValues.length) {
					// boosCount=0;//boss动图循环
					// }
					repaint();// 重绘
				}
			};
		}.start();

		// boss动图线程
		new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// heroCount++;//英雄动图序号
					boosCount++;// boss动图序号
					// if (heroCount==heroValues.length) {
					// heroCount=0;//英雄动图循环
					// }
					if (boosCount == bossValues.length) {
						boosCount = 0;// boss动图循环
					}
					repaint();// 重绘
				}
			};
		}.start();

		// 子弹动图线程
		new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// heroCount++;//英雄动图序号
					bullteCount++;// boss动图序号
					// if (heroCount==heroValues.length) {
					// heroCount=0;//英雄动图循环
					// }
					if (bullteCount == bulletValues.length) {
						bullteCount = 0;// boss动图循环
					}
					repaint();// 重绘
				}
			};
		}.start();

		// 爆炸效果动图
		/*
		 * new Thread() { public void run() { while (true) {
		 * boomImgImage=Toolkit.getDefaultToolkit().getImage("image/1.png");//+boomCount
		 * +".png" //boomCount++;
		 * 
		 * if(boomCount==10){ boomCount=0; }
		 * 
		 * } } }.start();
		 */

	}

	// 初始化英雄信息
	hero hero = new hero(18, 6, 1);// 初始化位置
	// 英雄动态加载
	private int heroCount = 0;
	private int[] heroValues = { 0, 32, 64, 96 }; // 四个动作

	// BOSS坐标
	private int boosx = 18;
	private int boosy = 9;
	private int boosCount = 0;
	private int[] bossValues = { 0, 34, 68, 102, 136, 170, 204, 238, 272, 306, 340, 374 };

	// 炮弹
	// 子弹容器
	private Vector<Bullet> bListBullets = new Vector<Bullet>();
	// 子弹动图
	private int bullteCount = 0;
	private int[] bulletValues = { 0, 192, 192 * 2, 192 * 3, 192 * 4, 192 * 5, 192 * 6, 192 * 7, 192 * 8, 192 * 9 };

	// 爆炸效果集合
	private Vector<Boom> boomlistBooms = new Vector<Boom>();
	private int boomCount = 0;

	// 绘制地图
	public void drawMap(Graphics g) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1) {
					g.drawImage(wallImgImage, j << 5, i << 5, 32, 32, this);
				} else if (map[i][j] == 2) {
					g.drawImage(stelsImage, j << 5, i << 5, 32, 32, this);
				} else if (map[i][j] == 3) {
					g.drawImage(warter1Img, j << 5, i << 5, 32, 32, this);
				} else if (map[i][j] == 4) {
					g.drawImage(grassImage, j << 5, i << 5, 32, 32, this);
				}
			}
		}

	}

	// 绘制背景图片
	public void drawBgImg(Graphics g) {
		g.drawImage(ngImgImage, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	// 绘制英雄
	public void drawHero(Graphics g) {
		switch (hero.getDirect()) {
		case 0: {// 向上
			g.drawImage(heroImage, hero.getY() << 5, hero.getX() << 5, (hero.getY() + 1) << 5, (hero.getX() + 1) << 5,
					heroValues[heroCount], 64, heroValues[heroCount] + 32, 96, this);
		}
			break;
		case 1: {// 向下
			g.drawImage(heroImage, hero.getY() << 5, hero.getX() << 5, (hero.getY() + 1) << 5, (hero.getX() + 1) << 5,
					heroValues[heroCount], 0, heroValues[heroCount] + 32, 32, this);
		}
			break;
		case 2: {
			// 向左
			g.drawImage(heroImage, hero.getY() << 5, hero.getX() << 5, (hero.getY() + 1) << 5, (hero.getX() + 1) << 5,
					heroValues[heroCount], 96, heroValues[heroCount] + 32, 128, this);
		}
			break;
		case 3: {
			// 向右
			g.drawImage(heroImage, hero.getY() << 5, hero.getX() << 5, (hero.getY() + 1) << 5, (hero.getX() + 1) << 5,
					heroValues[heroCount], 32, heroValues[heroCount] + 32, 64, this);
		}
			break;
		}
	}

	// 绘制boss
	public void drawBoss(Graphics g) {
		g.drawImage(bossImage, boosy << 5, boosx << 5, (boosy + 1) << 5, (boosx + 1) << 5, 0, bossValues[boosCount], 41,
				bossValues[boosCount] + 34, this);
	}

	// 绘制子弹
	public void drawBullet(Graphics g) {
		for (Bullet bullet : bListBullets) {
			g.drawImage(bulletImage, bullet.getY() << 5, bullet.getX() << 5, (bullet.getY() + 1) << 5,
					(bullet.getX() + 1) << 5, bulletValues[bullteCount], 0, bulletValues[bullteCount] + 192, 192, this);
		}
	}

	// 绘制爆炸效果
	public void drawBoom(Graphics g) {
		for (Boom boom : boomlistBooms) {
			g.drawImage(boomImgImage, boom.getY() << 5, boom.getX(), (boom.getY() + 1) << 5, (boom.getX() + 1) << 5, 0,
					0, 80, 80, this);
		}
	}

	// 重写绘图方法
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawBgImg(g);// 背景
		drawMap(g);// 地图
		drawHero(g);// 英雄
		drawBoss(g);// Boss
		drawBullet(g);// 子弹
		drawBoom(g);// 爆炸
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 键盘释放时事件
		// 先调方向后移动
		if (e.getKeyCode() == KeyEvent.VK_W) {// 向上
			if (hero.getDirect() == 0) {
				// int xx=hero.getX();
				// int yy=hero.getY();碰撞检测and边界检测
				if ((hero.getX() - 1 >= 0)
						&& (map[hero.getX() - 1][hero.getY()] == 0 || map[hero.getX() - 1][hero.getY()] == 4))
					hero.setX(hero.getX() - 1);// 如果本来就是向上，就直接移动
			} else {
				// 如果不是就先转向，下一步才能移动
				hero.setDirect(0);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {// 向下
			if (hero.getDirect() == 1) {// 碰撞检测and边界检测
				if ((hero.getX() + 1 < map.length)
						&& (map[hero.getX() + 1][hero.getY()] == 0 || map[hero.getX() + 1][hero.getY()] == 4))
					hero.setX(hero.getX() + 1);// 如果本来就是向上，就直接移动
			} else {
				// 如果不是就先转向，下一步才能移动
				hero.setDirect(1);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {// 向左
			if (hero.getDirect() == 2) {// 碰撞检测and边界检测
				if ((hero.getY() - 1 >= 0)
						&& (map[hero.getX()][hero.getY() - 1] == 0 || map[hero.getX()][hero.getY() - 1] == 4))
					hero.setY(hero.getY() - 1);// 如果本来就是向上，就直接移动
			} else {
				// 如果不是就先转向，下一步才能移动
				hero.setDirect(2);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {// 向右
			if (hero.getDirect() == 3) {// fuck teh 碰撞检测and边界检测
				if ((hero.getY() + 1 < map[hero.getX()].length)
						&& (map[hero.getX()][hero.getY() + 1] == 0 || map[hero.getX()][hero.getY() + 1] == 4))
					hero.setY(hero.getY() + 1);// 如果本来就是向上，就直接移动
			} else {
				// 如果不是就先转向，下一步才能移动
				hero.setDirect(3);
			}
		}

		// 产生子弹
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			bListBullets.add(new Bullet(hero.getX(), hero.getY(), hero.getDirect()));
			runBullet();
		}
		repaint();// 重绘界面
	}

	// 子弹四个方向的移动
	public void runBullet() {
		Bullet bullet = bListBullets.get(bListBullets.size() - 1);
		switch (bullet.getDirect()) {
		case 0: {
			Runnable ra0Runnable = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						if (bullet.getX() <= 0 || map[bullet.getX()][bullet.getY()] == 1
								|| map[bullet.getX() - 1][bullet.getY()] == 2) {
							if (map[bullet.getX()][bullet.getY()] == 1) {
								map[bullet.getX()][bullet.getY()] = 0;
								repaint();

							}
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							bListBullets.remove(bullet);
							break;
						}
						bullet.setX(bullet.getX() - 1);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}

				}
			};
			new Thread(ra0Runnable).start();
			break;
		}
		case 1: {
			Runnable ra1Runnable = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {

						if (bullet.getX() == 19 || map[bullet.getX()][bullet.getY()] == 1
								|| map[bullet.getX() + 1][bullet.getY()] == 2) {
							// boomlistBooms.add(new Boom(bullet.getX(), bullet.getY()));
							if (map[bullet.getX()][bullet.getY()] == 1) {
								map[bullet.getX()][bullet.getY()] = 0;
								repaint();

							}
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							bListBullets.remove(bullet);
							break;
						}
						bullet.setX(bullet.getX() + 1);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}

				}
			};
			new Thread(ra1Runnable).start();
			break;
		}

		case 2: {
			Runnable ra2Runnable = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {

						if (bullet.getY() == 0 || map[bullet.getX()][bullet.getY()] == 1
								|| map[bullet.getX()][bullet.getY() - 1] == 2) {
							if (map[bullet.getX()][bullet.getY()] == 1) {
								map[bullet.getX()][bullet.getY()] = 0;
								repaint();

							}
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							bListBullets.remove(bullet);
							break;
						}
						bullet.setY(bullet.getY() - 1);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}

				}
			};
			new Thread(ra2Runnable).start();
			break;
		}

		case 3: {
			Runnable ra3Runnable = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {

						if (bullet.getY() == 19 || map[bullet.getX()][bullet.getY()] == 1
								|| map[bullet.getX()][bullet.getY() + 1] == 2) {
							if (map[bullet.getX()][bullet.getY()] == 1) {
								map[bullet.getX()][bullet.getY()] = 0;
								repaint();

							}
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							bListBullets.remove(bullet);
							break;
						}
						bullet.setY(bullet.getY() + 1);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}

				}
			};
			new Thread(ra3Runnable).start();
			break;
		}

		}
	}

}
