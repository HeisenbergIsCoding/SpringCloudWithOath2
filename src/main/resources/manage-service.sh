#!/bin/bash

# 菜單選項
echo "選擇一個操作："
echo "1. 啟動服務"
echo "2. 停止服務"
echo "3. 查看 MySQL 日誌"
echo "4. 查看 Redis 日誌"
echo "5. 退出"
read -p "輸入你的選擇 (1/2/3/4/5): " choice

# 執行對應的操作
case $choice in
    1)
        docker-compose up -d
        ;;
    2)
        docker-compose down
        ;;
    3)
        docker-compose logs mysql
        ;;
    4)
        docker-compose logs redis
        ;;
    5)
        exit 0
        ;;
    *)
        echo "無效的選擇"
        ;;
esac