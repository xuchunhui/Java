				����
1.������󷽷�������������������װ���̳У���̬��
2.�̳������������ʵ���������õ���Ҫ�ֶΣ�����̳и����ֱ�ӻ�ø�������Ժͷ�����
3.��װָ���ǽ������ʵ��ϸ������������Ȼ��ͨ��һЩ���õķ�������¶�ö���Ĺ��ܣ�
4.��ָ̬��������������ֱ�Ӹ������������������ʱ��Ȼ���ֳ��������Ϊ������

����Ҳ������������Ҫ���֣�������Ǻ���һ���������뵱ǰĿ���޹ص���Щ���棬�Ա����ֵ�ע���뵱ǰľ����صķ��档
�����˽�ȫ����ֻ�ǿ��ǲ������⡣

1.������󣺶�����������󷽷���������ĸ�����Ļ����ص��ǣ���־Ψһ�ԣ������ԣ���̬�ԣ���װ�ԣ�ģ������Ժá�
2.���Ǿ��й�ͬ���ԣ���ͬ�����Ķ���ļ��ϡ����Ƕ���ĳ��󣻶��������ʵ����
3.������󷽷��У���֮�乲�����ԺͲ����Ļ��Ƴ�Ϊ�̳С�

			��������
1.���ݻ������ͷ����ࣺ��ֵ���ͣ��������͡���ֵ���Ͱ��������Σ��ַ��ͣ������ͣ�������ֵ����֮����Խ�������ת��������
�Զ�����ת����ǿ������ת����
2.���������:λ��������Ƚ���������߼��������

�ַ������ǻ����������ͣ��ַ���������һ���࣬һ�����õ��������͡�
byte��byte���������ڴ�ռ8λ�� -128~127
short:short�������������ڴ���ռ��16λ��-32768~32767
int��int�������������ڴ���ռ32λ�� -2^31~2^31-1
long:long�������������ڴ�ռ64λ��-2^63~2^63-1

Ĭ�����������������int�ͣ����㳣��Ĭ��Ϊdouble�͡�

short/byte c = 65;��ȷ�ģ�int����ֵ���Զ�ת��Ϊshort/byte�͡�
long value = 9999999999999���������ݹ���Ҫ�ں������L��long value = 9999999999999L�������Զ�ת�͡�
8��������012 ��0��ͷ��
16��������0X2f ��0X��ͷ��


javaû���ṩ�ַ����Ļ������ͣ�����ͨ��String������ʾ�ַ�����

int�Ϳ����Զ�ת����float�ͣ�

String a = 5; ����Ӧ��ΪString a = 5 + "";String b = 5 + 4 + ��jj�������Ϊ9jj��

���±���ʽ������ȷ�ģ�
byte b = 40;
char c = 'c'
int i = 23
double d = .314

19/4=4   19%4=3



switch�����Ʊ���ʽֻ���ǣ�byte��short��char��int������Ϊ�ַ�����

this����ָ��÷����Ķ���

���������Ա�������������ԣ�������
static���εĳ�Ա���ܷ���û��static���εĳ�Ա��
static���εĳ�Ա��������������๲�У����������ڸ���ĵ���ʵ��������ʵ��Ҳ�����ַ�����
ͨ����static���ε����Ժͷ���Ҳ��Ϊ�����ԣ��෽������ʹ��static
���ε���ͨ���������������ڸ���ĵ���ʵ���������ڸ��ࣻ
static���εķ����в�����this���ã�

��װ��
private ��Ա:�ó�Աֻ���ڸ�����ڲ������ʡ�
default ��Ա(Ĭ��):��Ա���Ա���ͬ������������ʡ�
protected ��Ա:��Ա���Ա�ͬһ��������������ʣ�Ҳ���Ա���ͬ���е�������ʡ�(�÷���ͨ����ϣ��������д�������)
public ��Ա:��Ա���Ա���������ʣ������Ƿ�ͬ������������


��ʼ����
��ĳ�ʼ���׶Σ���ִ����㸸��ľ�̬��ʼ���飬�������£����ָ��ǰ�ྲ̬��ʼ���飻
�����ʼ���׶Σ���ִ�ж��㸸��ĳ�ʼ���飬���������������£����ִ�е�ǰ���ʼ���飬��������

static�������ι�������

final���α�������ʾ�ñ���һ����ó�ʼֵ��Ͳ��ɸı䣻final���ε��಻��������(�� java.lang.Math)�����ܱ��̳�
Java �ṩ��Object���и�final���εķ�����getClass(),Java��ϣ���κ�����д��������������final
���������ڸ����ṩ��toString��equals������������������д��û����final��д��