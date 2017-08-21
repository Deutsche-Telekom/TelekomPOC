-- Primary Tables

create table sbl_renderer (
 	asset_version   		bigint  		not null,
  	workspace_id    		varchar(40)      	not null,
  	branch_id             		varchar(40)  	not null,
  	is_head                  	tinyint    	not null,
  	version_deleted         	tinyint          not null,
  	version_editable       		tinyint           not null,
  	pred_version              	bigint           null,
  	checkin_date              	datetime               null,
	renderer_id 			varchar(254)	not null,
	jsp_path 			nvarchar(254)	null,
	application_context 		nvarchar(254)	null,
	html_attributes 		nvarchar(4000)	null,
	PRIMARY KEY(renderer_id)
);

create table sbl_promotion_ui (
 	asset_version            	bigint                      not null,
  	workspace_id         		varchar(40)            not null,
  	branch_id              		varchar(40)            not null,
  	is_head                 	tinyint                     not null,
  	version_deleted           	tinyint                     not null,
  	version_editable          	tinyint                     not null,
  	pred_version                 	bigint                      null,
  	checkin_date             	datetime               null,
	promotion_ui_id			varchar(254)	not null,
	promotion_id     		varchar(254)  null,
	promotion_ui_name 		varchar(254)	null,
	controller 			varchar(254)	null references sbl_renderer(renderer_id),
	css_path 			nvarchar(254)	null,
	PRIMARY KEY(promotion_ui_id)
);

create table sbl_product_ui (
 	asset_version             	bigint                      not null,
  	workspace_id              	varchar(40)            not null,
  	branch_id              		varchar(40)            not null,
  	is_head                 	tinyint                     not null,
  	version_deleted           	tinyint                     not null,
  	version_editable          	tinyint                     not null,
  	pred_version              	bigint                      null,
  	checkin_date              	datetime               null,
        product_ui_id           	varchar(254)   not null,
        product_id              	varchar(254)   null,
        product_name            	varchar(254)   null,
        promotion_ui_id         	varchar(254)   null references sbl_promotion_ui (promotion_ui_id),
        root_product_flag       	tinyint     null,
        css_path                	nvarchar(254)   null,
        CHECK (root_product_flag IN (0, 1)),
        PRIMARY KEY(product_ui_id)
);

create table sbl_block (
 	asset_version             	bigint                      not null,
  	workspace_id              	varchar(40)            not null,
  	branch_id               	varchar(40)            not null,
  	is_head                     	tinyint                     not null,
  	version_deleted           	tinyint                     not null,
  	version_editable          	tinyint                     not null,
  	pred_version              	bigint                      null,
  	checkin_date              	datetime               null,
        block_id                	varchar(254)   not null,
        name                    	varchar(254)   null,
        display_name            	varchar(254)   null,
        type                    	integer null,
        renderer                	varchar(254)   null references sbl_renderer(renderer_id),
        active_flag             	tinyint     null,
        html_attributes         	nvarchar(4000)   null,
        CHECK (active_flag IN (0, 1)),
        PRIMARY KEY(block_id)
);

-- Auxilary Tables

create table sbl_attribute_block (
	asset_version             	bigint                      not null,
        block_id                	varchar(254)   not null references sbl_block(block_id),
        attribute_id            	varchar(254)   null,
        attribute_name          	varchar(254)   null,
        PRIMARY KEY(block_id)
);

create table sbl_relationship_block (
	asset_version             	bigint                      not null,
        block_id                	varchar(254)   not null references sbl_block(block_id),
        relationship_id         	varchar(254)   null,
        PRIMARY KEY(block_id)
);

-- Multi Tables

create table sbl_promotion_ui_roots (
	asset_version             	bigint                      not null,
	promotion_ui_id			varchar(254)	not null references sbl_promotion_ui (promotion_ui_id),
	sequence_num 			integer	not null,
	product_id 			varchar(254)	null,
	PRIMARY KEY(promotion_ui_id, sequence_num)
);

create table sbl_product_blocks (
	asset_version            	bigint                      not null,
	product_ui_id			varchar(254)	not null references sbl_product_ui (product_ui_id),
	sequence_num 			integer	not null,
	block_id 			varchar(254)	null references sbl_block(block_id),
	PRIMARY KEY(product_ui_id, sequence_num)
);

create table sbl_child_product_ui (
	asset_version             	bigint                      not null,
	block_id			varchar(254)	not null references sbl_block(block_id),
	sequence_num 			integer	not null,
	product_ui_id 			varchar(254)	null references sbl_product_ui(product_ui_id),
	PRIMARY KEY(block_id, sequence_num)
);
