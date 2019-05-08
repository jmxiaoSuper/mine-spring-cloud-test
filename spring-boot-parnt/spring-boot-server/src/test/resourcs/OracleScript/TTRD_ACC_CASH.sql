-- Create table
create table TTRD_ACC_CASH
(
  acc_id       VARCHAR2(30) not null,
  acc_name     VARCHAR2(255) not null,
  status      NUMBER,
  remark      VARCHAR2(200),
  pc1         VARCHAR2(30),
  pc2         VARCHAR2(30),
  pc3         VARCHAR2(30),
  pc4         VARCHAR2(30),
  currency    CHAR(3),
  invest_type NUMBER,
  i_id        NUMBER,
  pp_env_code VARCHAR2(30)
)
tablespace XIR_TRD_DAT
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table TTRD_ACC_CASH
  is '二级资金账户表';
-- Add comments to the columns
comment on column TTRD_ACC_CASH.acc_id
  is '账户代码';
comment on column TTRD_ACC_CASH.acc_name
  is '账户名称';
comment on column TTRD_ACC_CASH.status
  is '账户状态 3：停用 11：已启用';
comment on column TTRD_ACC_CASH.remark
  is '备注';
comment on column TTRD_ACC_CASH.pc1
  is '资金账户属性1 理财产品定义id';
comment on column TTRD_ACC_CASH.pc2
  is '资金账户属性2';
comment on column TTRD_ACC_CASH.pc3
  is '资金账户属性3';
comment on column TTRD_ACC_CASH.pc4
  is '资金账户属性4';
comment on column TTRD_ACC_CASH.currency
  is '币种';
comment on column TTRD_ACC_CASH.invest_type
  is '0自有资产（自营业务）、1客户资产（代客、理财）';
comment on column TTRD_ACC_CASH.pp_env_code
  is '定价环境代码';
-- Create/Recreate indexes
create index TTRD_ACC_CASH_IDX1 on TTRD_ACC_CASH (PC1)
  tablespace XIR_TRD_IDX
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  )
  nologging;

delete from TTRD_ACC_CASH t;
insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('33', '业务单元001', 11, null, '4', null, null, null, 'CNY', 1, 130, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('561', '市联社1号内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1646, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('563', '县级联社1-1号内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1648, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('825', '测试未上线机构内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1707, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('767', '县联社1-2内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1687, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('624', 'TEST内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1666, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('562', '市联社2号内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1647, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('564', '县级联社2-1号内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1649, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('768', '县联社2-2内部资金账户', 11, null, null, null, null, null, 'CNY', 0, 1688, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('1108', '金梅花母产品01', 11, null, '619', null, null, null, 'CNY', 1, 1472, null);

insert into TTRD_ACC_CASH (ACC_ID, ACC_NAME, STATUS, REMARK, PC1, PC2, PC3, PC4, CURRENCY, INVEST_TYPE, I_ID, PP_ENV_CODE)
values ('1120', '创富母产品01', 11, null, '621', null, null, null, 'CNY', 1, 1472, null);

prompt Done.

