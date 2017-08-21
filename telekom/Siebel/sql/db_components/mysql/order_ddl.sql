-- Primary Tables
create table sbl_order
(
  order_id					varchar(40)		not null,
  quote_number				varchar(20) not null,
  active_document_id				varchar(20)
,constraint sbl_order primary key (order_id)
);

create table sbl_ord_attr
(
  attribute_id					varchar(80)		not null,
  attribute_def_id				varchar(80)		null,
  attribute_name				varchar(80)		not null,
  action_code					integer			null,
  cfg_state_code		        varchar(80)		null,
  value							varchar(254)	null,
  propTypeCD                varchar(80)		null
,constraint sbl_ord_attr_p primary key (attribute_id)
);

-- Auxilary Tables

create table sbl_ord_comm_item
(
  commerce_item_id				varchar(80)		not null,
  action_code					integer			null,
  parent_relationship_id		varchar(80)		null,
  domain_item_id		        varchar(80)		null,
  cfg_state_code		        varchar(80)		null,
  configured                    tinyint         null,
  asset_number                    	varchar(80)     null,
  commerce_item_type            integer	        null,
  prod_promorule_id             varchar(80)     null,
  prod_promoinstance_id         varchar(80)     null,
  asset_integration_id			varchar(80)     null,
  quote_item_id					varchar(80)     null
,constraint sbl_ord_comm_item_p primary key (commerce_item_id)
,constraint sbl_ord_comm_item_f foreign key (commerce_item_id) references dcspp_item (commerce_item_id)
);

create table sbl_item_price_info
(
  amount_info_id				varchar(80)		not null,
  non_recurring_price			numeric(19,7)	null,
  monthly_recurring_price		numeric(19,7)	null
,constraint sbl_item_price_info_p primary key (amount_info_id)
,constraint sbl_item_price_info_f foreign key (amount_info_id) references dcspp_amount_info (amount_info_id)
);

create table sbl_order_price_info
(
  amount_info_id				varchar(80)		not null,
  non_recurring_price			numeric(19,7)	null,
  monthly_recurring_price		numeric(19,7)	null
,constraint sbl_order_price_info_p primary key (amount_info_id)
,constraint sbl_order_price_info_f foreign key (amount_info_id) references dcspp_amount_info (amount_info_id)
);

-- Multi Tables

create table sbl_ord_comm_item_attr
(
  commerce_item_id				varchar(80)	not null,
  sequence_num					integer		not null,
  attribute_id					varchar(80)	not null
,constraint sbl_ord_comm_item_attr_p primary key (commerce_item_id,sequence_num)
,constraint sbl_ord_comm_item_attr_f foreign key (commerce_item_id) references dcspp_item (commerce_item_id)
);

create table sbl_ord_comm_item_child
(
  commerce_item_id				varchar(80)	not null,
  sequence_num					integer		not null,
  commerce_item_child_id		varchar(80)	not null
,constraint sbl_ord_comm_item_child_p primary key (commerce_item_id,sequence_num)
,constraint sbl_ord_comm_item_child_f foreign key (commerce_item_id) references dcspp_item (commerce_item_id)
);

create table sbl_credit_card
(
  payment_group_id				varchar(80)		not null,
  credit_card_billing_profile_id		varchar(80)		not null
,constraint sbl_credit_card_p primary key (payment_group_id)
,constraint sbl_credit_card_f foreign key (payment_group_id) references dcspp_credit_card (payment_group_id)
);

create table sbl_hrd_ship_grp
(
  shipping_group_id				varchar(80)		not null,
  siebel_id		varchar(80)		not null
,constraint sbl_sbl_hrd_ship_grp_p primary key (shipping_group_id)
,constraint sbl_hrd_ship_grp_f foreign key (shipping_group_id) references dcspp_ship_group (shipping_group_id)
);
