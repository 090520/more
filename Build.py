import os
import shutil

print(('-' * 40 + '\n构建开始'))
os.system('gradlew build')
print(('构建结束\n'  + '-' * 40))
source_file = './build/libs/more-1.0.0.jar'
destination_file = '../web/more-2.0.0-fabric-1.20.1.jar'
print(('-' * 40 + '\n文件复制开始'))
try:
	shutil.copy2(source_file, destination_file)
except FileNotFoundError:
	print(f'源文件: [{source_file}] 未找到')
except Exception as e:
	print(f'复制文件时出现错误: [{e}]')
else:
	print(f'已将文件 [{source_file}] 复制到 [{destination_file}]')
print(('文件复制结束\n'  + '-' * 40))
