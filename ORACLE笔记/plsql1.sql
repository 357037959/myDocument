SQL> begin
  2  dbms_output.put_line('Hello');
  3  end;
  4  /

PL/SQL �����ѳɹ���ɡ�

SQL> set serveroutput on;
SQL> begin
  2  dbms_output.put_line('Hello');
  3  end;
  4  /
Hello                                                                           

PL/SQL �����ѳɹ���ɡ�

SQL> --ִ��һ��plsql��
SQL> ;
  1  begin
  2  dbms_output.put_line('Hello');
  3* end;
SQL> declare
  2  v_ename varchar2(5);
  3  begin
  4  select ename into v_ename from emp where emp = &aa;
  5  dbms_output.put_line('�û�����'||v_ename);
  6  end;
  7  /
���� aa ��ֵ:  7788
ԭֵ    4: select ename into v_ename from emp where emp = &aa;
��ֵ    4: select ename into v_ename from emp where emp = 7788;
select ename into v_ename from emp where emp = 7788;
                                         *
�� 4 �г��ִ���: 
ORA-06550: �� 4 ��, �� 42 ��: 
PL/SQL: ORA-00904: "EMP": ��ʶ����Ч
ORA-06550: �� 4 ��, �� 1 ��: 
PL/SQL: SQL Statement ignored 


SQL> declare
  2  v_ename varchar2(5);
  3  begin
  4  select ename into v_ename from emp where empno = &aa;
  5  dbms_output.put_line('�û�����'||v_ename);
  6  end;
  7  /
���� aa ��ֵ:  7788
ԭֵ    4: select ename into v_ename from emp where empno = &aa;
��ֵ    4: select ename into v_ename from emp where empno = 7788;
�û�����SCOTT                                                                   

PL/SQL �����ѳɹ���ɡ�

SQL> spool off;
